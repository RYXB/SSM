package com.atguigu.spring.proxy;

/**
 * @ClassName:CalculatorStaticProxy
 * @Author:lxd
 * @Date:2023/3/7 0:26
 * @Description:
 */
public class CalculatorStaticProxy implements Calculator{

    private CalculatorImpl target;

    public CalculatorStaticProxy(CalculatorImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        int Result = 0;
        try {
            System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
            Result = target.add(i, j);
            System.out.println("[日志] add 方法结束了，结果是：" + Result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return Result;
    }

    @Override
    public int sub(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);
        int Result = target.sub(i, j);
        System.out.println("[日志] sub 方法结束了，结果是：" + Result);
        return Result;
    }

    @Override
    public int mul(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);
        int Result = target.mul(i, j);
        System.out.println("[日志] mul 方法结束了，结果是：" + Result);
        return Result;
    }

    @Override
    public int div(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);
        int Result = target.div(i, j);
        System.out.println("[日志] div 方法结束了，结果是：" + Result);
        return Result;
    }
}
