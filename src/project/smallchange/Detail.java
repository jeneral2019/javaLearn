package project.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Detail {

    private String name;
    private double prices;
    private String   date;
    private double surplus;

    public Detail(String name, double prices,double surplus){
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.date = df.format(new Date());

        this.name = name;
        this.prices = prices;
        this.surplus = surplus + prices;
    }



    public double getSurplus() {
        return surplus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String[] printDetail(){
        String pricesStr;
        if (this.prices>0){
            pricesStr = "+" + prices;
        }else {
            pricesStr = "" + prices;
        }
        return new String[]{name,pricesStr,date, "余额：" + surplus};
    }
}
