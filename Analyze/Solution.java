package Analyze;

import java.util.Random;
import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {
        Lost[] lostArray=new Lost[20];//初始化Lost数组，用随机数创建不同的卡和书数据存入lostArray
        for(int i=0;i<lostArray.length;i++) {
            int r = (int) (Math.random() * 10);
            if (r % 2 == 0) {
                CardLost a = new CardLost();
                a.setYear(2015 + r);
                a.setMonth(r);
                a.setDay(1 + r);
                a.setWhere("千喜鹤");
                a.setCardNumber(2021214640+r);
                lostArray[i]=a;
            } else {
                BookLost a = new BookLost();
                a.setYear(2015 + r);
                a.setMonth(r);
                a.setDay(1 + r);
                a.setWhere("莘莘");
                a.setName("红楼梦");
                lostArray[i]=a;
            }
        }
//        方法一
//        sortLost(lostArray);
//        for(int i=0;i<lostArray.length;i++){
//            System.out.println(lostArray[i]);
//        }
//        方法二
        Lost[] answer=selectByKeyword(lostArray,"千喜鹤" );
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }



    /**
             * 失物排序方法
             * @param lostArray 待排序的失物数组
             */
            public static void sortLost(Lost[] lostArray){
                for(int i=0;i<lostArray.length-1;i++){
                    for(int j=0;j<lostArray.length-i-1;j++){
                        if(lostArray[j].day<lostArray[j+1].day){
                            Lost l=new Lost();
                            l=lostArray[j];
                            lostArray[j]=lostArray[j+1];
                            lostArray[j+1]=l;
                        }
                    }
                }
                for(int i=0;i<lostArray.length-1;i++){
                    for(int j=0;j<lostArray.length-i-1;j++){
                        if(lostArray[j].month <lostArray[j+1].month ){
                            Lost l=new Lost();
                            l=lostArray[j];
                            lostArray[j]=lostArray[j+1];
                            lostArray[j+1]=l;
                        }
                    }
                }
                for(int i=0;i<lostArray.length-1;i++){
                    for(int j=0;j<lostArray.length-i-1;j++){
                        if(lostArray[j].year<lostArray[j+1].year){
                            Lost l=new Lost();
                            l=lostArray[j];
                            lostArray[j]=lostArray[j+1];
                            lostArray[j+1]=l;
                        }
                        }
                    }
                }


    /**
     * 按关键字搜索失物的方法，这里假设按照失物的领取地点进行搜索
     * @param lostArray 失物数组
     * @param keyword 用户输入的关键字
     * @return 返回查找到的失物
     */
      public static Lost[] selectByKeyword(Lost[] lostArray, String keyword) {
        int j=0;

        for(int i=0;i<lostArray.length;i++){
            if(lostArray[i].where.equals(keyword)){
                j++;
            };
        }
        Lost[] lost=new Lost[j];
        for(int i=0;i<lostArray.length;i++){
            if(lostArray[i].where.equals(keyword)){
                j--;
                lost[j]=lostArray[i];

            };
        }
        return lost;
    }
}



