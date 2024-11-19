package com.raon.demos.middle2.collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        list.add(3, "addLast");
        System.out.println(list);
        list.add(0, "addFirst");
        System.out.println(list);

        Object remove = list.remove(4);
        System.out.println("remove = " + remove);

        Object remove1 = list.remove(0);
        System.out.println("remove1 = " + remove1);

        System.out.println(list);
    }
}
