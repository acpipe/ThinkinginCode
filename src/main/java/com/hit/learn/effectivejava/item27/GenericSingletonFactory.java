/**
 * 感觉这一讲没什么用，避免类型推导，现在的idea编译器都有缩写了，并不适用
 */
package com.hit.learn.effectivejava.item27;

/**
 * Created by Acceml on 2016/10/24.
 */
public class GenericSingletonFactory {

    //根据T，吧IDENTITY_FUNCTION转换为相应的类型，由于IDENTITY_FUNCTION返回未被修改的object类型参数，所以下面类型转换时安全的
    @SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }

    //先创建object对象，暂时替代T对象
    private static UnaryFunction<Object> IDENTITY_FUNCTION = new UnaryFunction<Object>() {
        public Object apply(Object arg) {
            return arg;
        }
    };


    public static void main(String[] args) {
        String[] strings =
                {"jute", "hemp", "nylon"};
        UnaryFunction<String> sameString = identityFunction();
        for (String s : strings)
            System.out.println(sameString.apply(s));

        Number[] numbers =
                {1, 2.0, 3L};
        UnaryFunction<Number> sameNumber = identityFunction();
        //这里用来判断是否真的实现了单例
        Object t1 = sameString;
        Object t2 = sameNumber;

        if (t1 == t2) {
            System.out.println("相同引用");
        }

        String s1 = "123456";
        String s2 = new String("123456");

        if (s1.equals(s2))
            System.out.println("相同内容");


        for (Number n : numbers)
            System.out.println(sameNumber.apply(n));
    }
}
