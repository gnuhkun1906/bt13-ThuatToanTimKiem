package bt2;

import java.util.*;

public class Search implements Comparator<Integer> {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Nhập vào số phần tử muốn theem");
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        for (int i = 0; i <count; i++) {
            System.out.println("Nhập vào phần tử thứ "+(i+1));
            int num=scanner.nextInt();
            list.add(num);
        }
            Collections.sort(list);

        System.out.println(list);
        System.out.println("Nhập vào số muốn tìm kiếm");
        int key=scanner.nextInt();
        System.out.println(binarySearch( list, list.get(0), list.get(list.size()-1), key));
    }
    public static int binarySearch(ArrayList<Integer> list, int left, int right ,int value) {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (value==list.get(middle)){
              return middle;
          }
          if (value>list.get(middle)){
              return binarySearch(list,middle+1,right,value);
          }else {
              return binarySearch(list,left,middle-1,value);
          }
        }
        return -1;
    }


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
