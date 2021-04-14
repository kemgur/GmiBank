package com.gmibank.utilities;



import com.gmibank.pojos.Applicants;
import com.gmibank.pojos.Country3;
import com.gmibank.pojos.Customer5;
import com.gmibank.pojos.States;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {


    public static List<Customer5> returnCustomer(String filePath){
        List<Customer5>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(ConfigurationReader.getProperty(filePath)))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                Customer5 customer = new Customer5();
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                String [] each = line.split(",");
                customer.setFirstName(each[0]);
                customer.setLastName(each[1]);
                customer.setSsn(each[2]);
                all.add(customer);
            }
            String everything = sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }



    public static List<Applicants> returnCustomerSNN(String filePath){
        List<Applicants>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Applicants applicants = new Applicants();
                applicants.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();

                System.out.println(i++);

                all.add(applicants);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<Customer5> readTxtData(String filePath)throws  Exception{
        List<Customer5> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            Customer5 customer = new Customer5();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
//                customer.setSsn(line);

            }
            String everything = sb.toString();

            customer.setSsn(everything);
            list.add(customer);
        } finally {
            br.close();
        }
        return list;

    }

    public static List<States> returnAllStates(String filePath){
        List<States>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                States state = new States();
                String [] allLine = line.split(",");

                int id = Integer.parseInt(allLine[1].trim());
                state.setId(id);
                state.setName(allLine[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();

                System.out.println(i++);

                all.add(state);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnCustomerSNNList(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Customer5 customer = new Customer5();
                customer.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();

                System.out.println(i++);

                all.add(customer.getSsn());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnCountryIdList(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int i = 0;
            while (line != null) {
                Country3 country = new Country3();
                country.setId(line.split(", ")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                i++;
                all.add(country.getId());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }


    public static List<States> returnAllStates2(String filePath){
        List<States>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                States states = new States();
                states.setName(line.split(",")[0].trim());
                states.setId(Integer.parseInt(line.split(",")[1].trim()));
                sb.append(System.lineSeparator());
                line = br.readLine();

                System.out.println(i++);

                all.add(states);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnAllStates3(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                String temp = "";
                temp =line.split(",")[0].trim();

                sb.append(System.lineSeparator());
                line = br.readLine();

                System.out.println(i++);

                all.add(temp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }


}


