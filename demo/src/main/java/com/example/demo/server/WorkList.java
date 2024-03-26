package com.example.demo.server;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.FinanceData;


public class WorkList {
    public List<FinanceData> getFinanceDataList() {
        // TODO: Implement the logic to fetch finance data from the server
        // For now, let's return a dummy list of finance data
        
        List<FinanceData> financeDataList = new ArrayList<>();
        
        // Add dummy finance data to the list
        financeDataList.add(new FinanceData("John Doe", "2021-01-01", 1000.00));
        financeDataList.add(new FinanceData("Jane Smith", "2021-01-02", 1500.00));
        financeDataList.add(new FinanceData("Bob Johnson", "2021-01-03", 2000.00));
        
        return financeDataList;
    }

    public String methodToTest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'methodToTest'");
    }
}
