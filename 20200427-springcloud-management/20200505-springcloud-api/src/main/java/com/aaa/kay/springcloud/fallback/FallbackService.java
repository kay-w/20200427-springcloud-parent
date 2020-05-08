package com.aaa.kay.springcloud.fallback;

import com.aaa.kay.springcloud.service.IBookService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.List;

/**
 * @ClassName FallbackService
 * @Description: FallbackFactory 是一个统一熔断工厂  需要告诉该工厂哪一个类的熔断  无论是consumer
 *      调用api还是api调用provider  最终所有的调用都和api相关 熔断完api之后就必须要重写api接口中的所有方法
 *      在springcloud2.x中 hytrix 做了一个非常大的改动
 *        无论consumer中国有多少controller api的接口都有一个
 *        最终api接口中的命名要规则 不能再具体的命名了一般情况下是以项目名命名的
 *        ISpringCloudService 但是不能再写成IBookService IUserService等等
 *          一个常规方法就必须有一个后备方法 只能有一个
 * @Author 59983
 * @Date 2020/5/6
 * @Version V1.0
 **/
@Component
public class FallbackService implements FallbackFactory<IBookService> {

    public IBookService create(Throwable throwable) {
        IBookService bookService = new IBookService() {
            public List<Book> selectAllBooks() {
                System.out.println("目前服务器正处于降级，请等待回复通知!!");
                return null;
            }
        };
        return bookService;

    }
}