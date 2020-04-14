package org.acme.ff.service;

import org.acme.ff.dto.InputDto;
import org.acme.ff.dto.OutputDto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface DemoService {

    public OutputDto process(@Valid @NotNull InputDto input);

}
