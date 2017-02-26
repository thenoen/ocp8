package ConcurrentCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentHashMapInThreads {

	static ConcurrentHashMap<String, Object> chm = new ConcurrentHashMap<String, Object>();

	public static void main(String[] args) {
		chm.put("a", "aaa");
		chm.put("b", "bbb");
		chm.put("c", "ccc");

		new Thread(){
			public void run(){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Iterator<Entry<String, Object>> it = ConcurrentHashMapInThreads.chm.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, Object> en = it.next();
					if(en.getKey().equals("a") || en.getKey().equals("b")){
						it.remove();
					}
				}
			}
		}.start();

		new Thread(){
			public void run(){
				Iterator<Entry<String, Object>> it = ConcurrentHashMapInThreads.chm.entrySet().iterator();
				while(it.hasNext()){
					Entry<String, Object> en = it.next();
					System.out.print(en.getKey()+", ");
				}
			}
		}.start();

		AtomicInteger atomicInteger = new AtomicInteger();
		atomicInteger.getAndAccumulate(1, (a, b) -> a + b);

//		ArrayList<?> a = new ArrayList<?>(Arrays.asList("a"));
	}
}


