package com.lamdaexoression;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main  {
    public static void main(String [] args){

    Main m= new Main();

    Test test= i -> i*i;
        System.out.println(test.test(7));
    }




}
