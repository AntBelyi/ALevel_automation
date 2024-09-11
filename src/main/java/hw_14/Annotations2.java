package hw_14;

import java.lang.reflect.Method;

public class Annotations2 {
    MyClass a = new MyClass();
    Class<MyClass> aclass = a.getClass();

    Class<MyClass> aclass = MyClass.class;

    Class<?> c = Class.forName("java.lang.Byte");

    getName()
    getSimpleName()
    getModifiers()
    getSuperclass()
    getInterface()

    getField(): Field[]
    getDeclaredFields(): Field[]
    getField(String name) Field

    getMethod(): Method[]
    getDeclaredMethod(): Method[]
    getMethod(name, paramTypes): Method

    getConstructors(): Constructor<?>[]
    getDeclaredConstructor(): Constructor<?>[]
    getConstructor(paramTypes): Constructor<?>

    Class<?> c = Class.forName('SimpleService');
    Object obj = c.newInstance();
    SimpleService test = (SimpleService) obj;

    Constructor<?> con = c.getConstuctor();
    Object obj = con.newInstance();

    Map<String, Object> serviceMap = new HashMap<>();

    puclic static void main(String[] args) {
        loadSevice("service.SimpleService");
        loadService("service.LayService");
        loadService("java.lang.String");
    }

    static void loadService(String className) {
        Class<?> clazz = Class.forName(className);
        if (clazz.isAnnotationPresent(Service.class)) {
            Object serviceObj = clazz.newInstance();
        }
        Class[] paramTypes = new Class[] { String.class, int.class};
        Method method = c.getMethod("methodName", paramTypes);
        Object[] args = new Object[] {new String("aa") new integer(10));

Double d = (Double) method.invoke(obj, args);
}

for (Method method : methods) {
if (method.isAnnotationPresent(Int.class)){
    try {
        method.invoke(serviceObj);
    } catch (Exception e) {
        Init ann = method.getAnnotation(Init.class);
        if (ann.suppressException()) {
            System.err.println(e.getMessage());
        } else {
            throw new RuntimeException(e);
        }

        Method method = c.getDeclaredMethod();
        method.setAccessible(true);

        class SomeClass {
            private int pri = 0;

            Field f = c.getDeclaredField("pri");
            f.setAccessible(true);
            f.srtInt(obj,47);
        }
        }
    }

    }
}
    }