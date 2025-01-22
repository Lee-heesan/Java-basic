package java_mid_2.collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
        
        //ArrayList>LinkedList 계산 시간이 ArrayList가 더 큼
    }
}
