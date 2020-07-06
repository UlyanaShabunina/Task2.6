package ru.vsu.cs.course1;


public class Task {
    public static int[] process(int[] arr) throws Exception {
        MyLinkedList<Integer> nlist = new MyLinkedList<>();
        MyLinkedList<Integer> nlist2 = new MyLinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            nlist.addFirst(arr[i]);
        }
        for (int i = 0; i<nlist.size; i++){
            int a = nlist.get(i);
            if(a%2==1){
                nlist2.addFirst(a);
            }
        }
        int [] array = new int [nlist2.size];
        for (int i = 0; i < array.length; i++) {
            array[i] = nlist2.get(i);
        }

        return array;
    }

}
