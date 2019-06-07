package controllers;

import apimodels.Correlation;
import apimodels.Gene;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import swagger.SwaggerUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import play.Configuration;

import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-06-07T15:59:07.572Z")

public class TypesApiController extends Controller {

    private final TypesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private TypesApiController(Configuration configuration, TypesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result correlationsEntrezGeneIdGet(Integer entrezGeneId) throws Exception {
        List<Correlation> obj = imp.correlationsEntrezGeneIdGet(entrezGeneId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Correlation curItem : obj) {
                SwaggerUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result genesGet() throws Exception {
        List<Gene> obj = imp.genesGet();
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Gene curItem : obj) {
                SwaggerUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
