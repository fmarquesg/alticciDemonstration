package winprovit.alticciDemonstration.Controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import winprovit.alticciDemonstration.AlticciSolverService.AlticciSolverService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlticciSolverController {

    @GetMapping("/alticci/{n}")
    public ResponseEntity<List<Integer>> mapAlticci(@PathVariable(value = "n") int n) {

        List<Integer> result = new ArrayList<>();

        result = AlticciSolverService.alticciIterator(n);

        return new ResponseEntity<List<Integer>>(result, HttpStatus.OK);
    }
}
