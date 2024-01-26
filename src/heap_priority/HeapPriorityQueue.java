package heap_priority;

public class HeapPriorityQueue {

	 public static void main(String[] args) {

//	        Heap<Integer> maximumHeap = new MaximumHeap<>();
//	        maximumHeap.insert(50).insert(40).insert(60).insert(30).insert(70).insert(20).insert(100);
//	        maximumHeap.print();
//
//	        System.out.println(maximumHeap.getRoot());
//	        maximumHeap.print();
//
//	        maximumHeap.sort();
//
//	        System.out.println("==========================================");

	        Heap<Integer> minimumHeap = new MinimumHeap<>();
	        minimumHeap.insert(50).insert(40).insert(60).insert(30).insert(70).insert(20).insert(100);
	        minimumHeap.print();
         
	        System.out.println(minimumHeap.getRoot());
	        minimumHeap.print();
	        
	       
	        

	        minimumHeap.sort();
	        minimumHeap.heapify_up();
	        minimumHeap.print();
	        minimumHeap.extractMin();
	        minimumHeap.print();
	        minimumHeap.heapify_down(1);
	        minimumHeap.print();
	        
	        int heap[] = {20, 18, 10, 12, 9, 9, 3};
	        int n= heap.length;
	        
	        System.out.println("The minimum element in the heap :" +findMinimumElement(heap, n));
	        
	   
	        


	    }
	 public  static int findMinimumElement(int heap[], int n)
     {
         int minimumElement = heap[0];
  
         for (int i = 1; i < n; ++i)
             minimumElement
                 = Math.min(minimumElement, heap[i]);
  
         return minimumElement;
     }
	 
	}

