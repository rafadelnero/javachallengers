package invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class InvocationHandlerChallenge implements InvocationHandler {

    private final List proxied;
    InvocationHandlerChallenge(List proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("remove")) {
            return false;
        }

        if (method.getName().startsWith(""+(char)99) || method.getName().startsWith(""+(char)101)) {
            return false;
        }

        return method.invoke(proxied, args);
    }

    public static void main(String... doYourBest) {
        var proxy = (List) Proxy.newProxyInstance(
                InvocationHandlerChallenge.class.getClassLoader(),
                new Class[] { List.class },
                new InvocationHandlerChallenge(new ArrayList()));
        proxy.add("Barney");
        proxy.add("Homer");
        proxy.add("Moe");
        proxy.remove("Homer");
        proxy.remove("Moe");
        proxy.add(proxy.contains("Homer"));
        proxy.add(proxy.equals(proxy));

        System.out.println(proxy);
    }
}


