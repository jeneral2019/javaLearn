package project.smallchange;

import java.util.ArrayList;
import java.util.List;

/**
 * 明细
 * @author yuxiangfeng
 */
public class SmallChange {

    private List<Detail> details = new ArrayList<>();

    public void getDetails(){
        System.out.println("----------零钱通明细----------");
        if (details ==  null || details.size() == 0){
            System.out.println("您还没有消费记录");
            return;
        }
        for (int i = 0;i < details.size();i++){
            String[] printDetail = details.get(i).printDetail();
            System.out.println(printDetail[0] + "\t" +printDetail[1] + "\t"+printDetail[2] + "\t" + printDetail[3]);
        }
    }

    public void setDetails(String name,double price){
        Detail detail;
        if (details ==  null || details.size() == 0){
            detail = new Detail(name,price,0);
        }else {
            if (price <0 && details.get(details.size()-1).getSurplus() + price < 0){
                System.out.println("余额不足，无法消费");
                return;
            }
            detail = new Detail(name,price,details.get(details.size()-1).getSurplus());
        }
        details.add(detail);
    }

    public void income(double price){
        setDetails("收益入账",price);
    }

    public void consume(String name,double price){
        setDetails(name,-price);
    }

}
