import com.lagou.service.HelloService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @Author Jaa
 * @Date 2022/3/26 22:23
 * @Description
 */
public class DubboAdaptiveMain {

    public static void main(String[] args) {
        URL url = URL.valueOf("test://localhost:/hello?hello.service=human");
        HelloService adaptiveExtension = ExtensionLoader.getExtensionLoader(HelloService.class).getAdaptiveExtension();
        String msg = adaptiveExtension.sayHello(url);
        System.out.println(msg);
    }
}
