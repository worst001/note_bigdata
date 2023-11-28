import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

public class JSONUDTF extends GenericUDTF {

    @Override
    public StructObjectInspector initialize(ObjectInspector[] argOIs) throws UDFArgumentException {
        if (argOIs.length != 1) {
            throw new UDFArgumentException("JSONUDTF takes only one argument");
        }
        // 读取JSON字符串，因此只需要一个String类型的参数
        if (!"string".equals(argOIs[0].getTypeName())) {
            throw new UDFArgumentException("JSONUDTF takes a string as a parameter");
        }

        // 定义返回字段名
        ArrayList<String> fieldNames = new ArrayList<String>();
        ArrayList<ObjectInspector> fieldOIs = new ArrayList<ObjectInspector>();

        fieldNames.add("id");
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);

        fieldNames.add("name");
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);

        fieldNames.add("age");
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);

        // 将字段名及字段类型传入构造函数
        return ObjectInspectorFactory.getStandardStructObjectInspector(fieldNames, fieldOIs);
    }

    // 处理输入数据，输出多行数据
    @Override
    public void process(Object[] args) throws HiveException {

        // 读取JSON字符串
        String jsonStr = args[0].toString();

        // 将JSON字符串转成JSON对象
        JSONObject object = JSONObject.parseObject(jsonStr);
        if (object == null) return;

        // 获取JSON对象中的字段
        String id = object.getString("id");
        String name = object.getString("name");
        String age = object.getString("age");

        // 输出多行数据
        String[] result = new String[] {id, name, age};
        forward(result);
    }

    @Override
    public void close() throws HiveException {
    }
}
