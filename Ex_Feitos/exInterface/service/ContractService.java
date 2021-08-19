package service;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Instalment;

public class ContractService {
/*
    private OnlinePaymentService onlinePaymentService;
    
    public ContractService() {
    }
    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract, Integer months){
        double basicQuota = contract.getTotalValue()/months;
        for (int i = 1; i <= months; i++) {
            double aux = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double calJuros = aux + onlinePaymentService.paymentFee(aux);
            Date dueDate = addMonths(contract.getDate(), i);
            contract.getInstalments().add(new Instalment(dueDate, calJuros));
        }
    }

    private Date addMonths(Date date, int N){
        Calendar calenda = Calendar.getInstance();
        calenda.setTime(date);
        calenda.add(Calendar.MONTH, N);
        return calenda.getTime();
    }
}
*/