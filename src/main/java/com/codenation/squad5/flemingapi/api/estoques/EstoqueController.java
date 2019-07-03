package com.codenation.squad5.flemingapi.api.estoques;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hospitais/{id}/estoques")
@Api(value = "estoques", produces = MediaType.APPLICATION_JSON_VALUE)
public class EstoqueController {
}
