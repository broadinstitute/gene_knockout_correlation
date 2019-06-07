package controllers;

import apimodels.Correlation;
import apimodels.Gene;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface TypesApiControllerImpInterface {
    List<Correlation> correlationsEntrezGeneIdGet(Integer entrezGeneId) throws Exception;

    List<Gene> genesGet() throws Exception;

}
