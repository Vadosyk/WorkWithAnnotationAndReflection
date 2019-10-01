package ua.kiev.prog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WorkClass {
    public static String repParam(Class<?>... cls) {

        StringBuilder sb = new StringBuilder();
         for (Class<?> cl : cls) {
            sb.append("Usеd class: " + cl.getSimpleName());
            for (Method method : cl.getDeclaredMethods()) {
                if (method.getAnnotationsByType(TestAnnotation.class) != null) {
                    try {
                        Object obj = cl.newInstance();
                        for (TestAnnotation annotation : method.getAnnotationsByType(TestAnnotation.class)) {
                            method.invoke(obj, annotation.a(), annotation.b());
                        }
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return sb.toString();
    }
}
