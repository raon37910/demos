package com.raon.demos.basic.poly.problem;

public class PayService {

    public void processPay(String option, int amount) {
        boolean result = false;
        Pay pay = null;

        if (option.equals("kakao")) {
            pay = new KakaoPay();
        } else if (option.equals("naver")) {
            pay = new NaverPay();
        } else {
            System.out.println("결제 수단이 없습니다.");
        }

        if (pay != null) {
            result = pay.pay(amount);
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else  {
            System.out.println("결제가 실패 했습니다.");
        }
    }
}
