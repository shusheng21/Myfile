package charpter07;

public class digui01 {
    public static void main(String[] args) {
        T t1 = new T();
        int day = 1;
        int PeachNum = t1.peach(day);
        if(PeachNum == -1){
            System.out.println("天数不对");
        }
        else{
            System.out.println("第" + day + "天的桃子数量为：" + PeachNum);
         }
    }
}
/*
猴子吃桃子  
第一天吃总数的一半后再多吃一个，
第二天也是吃一半后再多吃一个
到了第10天，想吃时（还没吃）发现只有1个了

问第一天有几个桃子

分析： 
day10  有 1 个桃子
day9   day10 = day9/2-1  => day9 = (day10 + 1) * 2 
day8  有   day8 = (day9 + 1) * 2    个桃子
...
 */
class T{
    public int peach(int day){
        if(day == 10){
            return 1;
        }
        else if(day >= 1 && day <= 9){
            return ((peach(day + 1) + 1) * 2);
        }
        else{
            return -1;
        }
    }
}
