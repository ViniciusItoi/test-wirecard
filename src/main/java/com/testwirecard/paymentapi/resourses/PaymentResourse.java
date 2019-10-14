package com.testwirecard.paymentapi.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testwirecard.paymentapi.model.Payment;
import com.testwirecard.paymentapi.repository.PaymentRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API Rest payment")
@CrossOrigin(origins = "*")
public class PaymentResourse {
	@Autowired
	PaymentRepository paymentRepository;

	@GetMapping("/payments")
	@ApiOperation(value = "Lista Todos os Pagamentos")
	public List<Payment> listPayment() {
		return paymentRepository.findAll();
	}

	@GetMapping("/payment/{id}")
	@ApiOperation(value = "Retorna um Pagamento")
	public Payment listPaymentUnico(@PathVariable(value = "id") long id) {
		return paymentRepository.findById(id);
	}

	@PostMapping("/payment")
	@ApiOperation(value = "Salva Pagamento")
	public Payment savePayment(@RequestBody Payment payment) {
		return paymentRepository.save(payment);
	}

	@DeleteMapping("/payment")
	@ApiOperation(value = "Deleta Pagamento")
	public void deletePayment(@RequestBody Payment payment) {
		paymentRepository.delete(payment);
	}

	@PutMapping("/payment")
	@ApiOperation(value = "Atualiza Pagamento")
	public Payment updatePayment(@RequestBody Payment payment) {
		return paymentRepository.save(payment);
	}
}
