package atlantic2.transaction.presentation.ressource;

import atlantic2.transaction.controller.VaNiquerTaMereController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/vaniquertamereAsAService")
@EnableAutoConfiguration
@CrossOrigin
public class NiquageDeMereRessource {

    @Autowired
    private VaNiquerTaMereController vaNiquerTaMereController;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getBatard(@RequestParam(value = "name", defaultValue = "batard") String name) {

        return ResponseEntity.ok(
                vaNiquerTaMereController.niquageDeMereProcessing(name)
        );
    }
}
