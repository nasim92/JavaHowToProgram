package main.java.JavaHowToProgram.utill;

import java.lang.reflect.InvocationTargetException;

public class JFrameProperty {
    public static <T> T createComponent(Class<T> type, String name) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        T component = type.newInstance();
        component.getClass().getMethod("a", String.class).invoke(component, name);

        return component;
    }

}
