package st;

import java.util.*;

public class MinHeapPriorityQueue {
	

	static int []H = new int[50];
	static int size = -1;


	static int parent(int i)
	{
	return (i - 1) / 2;
	}


	static int leftChild(int i)
	{
	return ((2 * i) + 1);
	}


	static int rightChild(int i)
	{
	return ((2 * i) + 2);
	}


	static void heapify_up(int i)
	{
	while (i > 0 &&
	H[parent(i)] > H[i])
	{

	swap(parent(i), i);


	i = parent(i);
	}
	}


	static void heapify_down(int i)
	{
	int maxIndex = i;


	int l = leftChild(i);

	if (l <= size &&
	H[l] > H[maxIndex])
	{
	maxIndex = l;
	}


	int r = rightChild(i);

	if (r <= size &&
	H[r] > H[maxIndex])
	{
	maxIndex = r;
	}


	if (i != maxIndex)
	{
	swap(i, maxIndex);
	heapify_down(maxIndex);
	}
	}


	static void insert(int p)
	{
	size = size + 1;
	H[size] = p;


	heapify_up(size);
	}


	static int extractMax()
	{
	int result = H[0];


	H[0] = H[size];
	size = size - 1;


	heapify_down(0);
	return result;
	}


	static void changePriority(int i,
	   int p)
	{
	int oldp = H[i];
	H[i] = p;

	if (p > oldp)
	{
	heapify_up(i);
	}
	else
	{
	heapify_down(i);
	}
	}


	static int getMin()
	{
	return H[0];
	}


	static void remove(int i)
	{
	H[i] = getMin() + 1;


	heapify_up(i);


	extractMax();
	}

	static void swap(int i, int j)
	{
	int temp= H[i];
	H[i] = H[j];
	H[j] = temp;
	}


	public static void main(String[] args)
	{

	insert(34);
	insert(20);
	insert(87);
	insert(12);
	insert(39);
	insert(9);
	insert(11);
	insert(11);
	insert(3);

	int i = 0;


	System.out.print("Priority Queue : ");
	while (i <= size)
	{
	System.out.print(H[i] + " ");
	i++;
	}

	System.out.print("\n");


	System.out.print("Node with Max priority : " +
	  extractMax() + "\n");


	System.out.print("Priority queue after " +
	 "extracting maximum priority : ");
	int j = 0;
	while (j <= size)
	{
	System.out.print(H[j] + " ");
	j++;
	}

	System.out.print("\n");


	changePriority(2, 49);
	System.out.print("Priority queue after " +
	 "priority change : ");
	int k = 0;
	while (k <= size)
	{
	System.out.print(H[k] + " ");
	k++;
	}

	System.out.print("\n");


	remove(3);
	System.out.print("Priority queue after " +
	 "removing the element : ");
	int l = 0;
	while (l <= size)
	{
	System.out.print(H[l] + " ");
	l++;
	}

	System.out.print("\n");

	heapify_up(2);
	System.out.print("priority queue after" + "shifting up :");
	int n=0;
	while(n <= size)
	{
		System.out.print(H[n] + " ");
		n++;
	}
	}
}

	