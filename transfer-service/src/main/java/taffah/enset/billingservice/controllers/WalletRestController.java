package taffah.enset.billingservice.controllers;

import org.springframework.web.bind.annotation.RestController;
import taffah.enset.billingservice.repositories.TransferRepository;

@RestController
class WalletRestController {
    private TransferRepository billRepository;

    /*InventoryServiceClient inventoryServiceClient;
    @GetMapping("/bills/full/{id}")
    Bill getBill(@PathVariable(name="id") Long id){
        Bill bill=billRepository.findById(id).get();
        bill.setCustomer(customerServiceClient.findCustomerById(bill.getCustomerID()));
        bill.setProductItems(productItemRepository.findByBillId(id));
        /*bill.getProductItems().forEach(pi->{
            pi.setProduct(inventoryServiceClient.findProductById(pi.getProductID()));
        });*/
        //return bill;
    //}
}
