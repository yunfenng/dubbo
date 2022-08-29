import com.lagou.service.HelloService;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Set;

/**
 * @Author Jaa
 * @Date 2022/3/26 22:01
 * @Description
 */
public class DubboSpiMain {

    public static void main(String[] args) {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);
        Set<String> extensions = extensionLoader.getSupportedExtensions();
        for (String extension : extensions) {
            String result = extensionLoader.getExtension(extension).sayHello();
            System.out.println(result);
        }
    }
}
