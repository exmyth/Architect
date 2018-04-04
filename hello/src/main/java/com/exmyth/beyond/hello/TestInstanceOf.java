package com.exmyth.beyond.hello;

/**
 * Created by exmyth on 18/2/24.
 */
public class TestInstanceOf {
    public static void main(String[] args) {
        Model model = null;
        SubModel subModel = new SubModel();
        System.out.println(model instanceof Model);
        System.out.println(subModel instanceof Model);
    }

    static class Model{

    }

    static class SubModel extends Model{

    }
}
