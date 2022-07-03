package com.omlucy.design.structure.facede;

/**
 * @author lucy
 * @date 2022/1/11
 */
public class Client {
    public static void main(String[] args) {
        // 找蔬菜商买菜
        VegVendor vegVendor = new VegVendor();
        vegVendor.purchase();
        // 找妹妹下厨
        Helper sister = new Helper();
        sister.cook();
        // 客户端用餐
        Client client = new Client();
        client.eat();
        // 洗碗
        client.wash();
    }

    public void eat() {
        System.out.println("开始用餐.....");
    }

    public void wash() {
        System.out.println("洗碗......");
    }
}
