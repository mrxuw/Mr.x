import com.sun.org.apache.xpath.internal.operations.String;

import java.util.concurrent.*;

public class Test01 {
  public static void main(String[] args) {
//        //初始化线程t1,由于后续有匿名内部类调用这个对象,需要用final修饰
//        final Thread t1 = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("t1 is running");
//            }
//        });
//        //初始化线程t2,由于后续有匿名内部类调用这个对象,需要用final修饰
//        final Thread t2 = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
////                try {
////                    //t1调用join方法,t2会等待t1运行完之后才会开始执行后续代码
////                   // t3.join();
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                } finally {
////                    System.out.println("t2 is running");
////                }
//            }
//        });
//        //初始化线程t3
//        Thread t3 = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                try {
//                    //t2调用join方法,t3会等待t2运行完之后才会开始执行后续代码
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } finally {
//                    System.out.println("t3 is running");
//                }
//            }
//        });
//        //依次启动3个线程
//        t1.start();
//        t2.start();

//        t3.start();

       BlockingQueue blockingQueue=new ArrayBlockingQueue<>(1);

       ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(10, 20, 1, TimeUnit.MINUTES, blockingQueue);
      //ThreadPoolExecutor executorService = Executors.newFixedThreadPool(10);

  }

}
