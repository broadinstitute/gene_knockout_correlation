package controllers;

import apimodels.Correlation;
import apimodels.Gene;
import db.DBQuery;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-06-07T15:59:07.572Z")

public class TypesApiControllerImp implements TypesApiControllerImpInterface {
    @Override
    public List<Correlation> correlationsEntrezGeneIdGet(Integer entrezGeneId) throws Exception {
        return DBQuery.getCorrelations(entrezGeneId);
    }

    @Override
    public List<Gene> genesGet() throws Exception {
        return DBQuery.getGenes();
    }

}
