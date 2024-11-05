package aegis.banktransactiontrackpoc.controller;

import aegis.banktransactiontrackpoc.service.IbkTransactionParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class Controller {

    @PostMapping("/transaction")
    public void transaction(@RequestBody String request) {
        log.info(IbkTransactionParser.parse(request).toString());
    }
}
