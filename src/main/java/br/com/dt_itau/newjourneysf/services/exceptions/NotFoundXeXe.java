package br.com.dt_itau.newjourneysf.services.exceptions;

import java.util.NoSuchElementException;

public class NotFoundXeXe extends NoSuchElementException {

    public NotFoundXeXe(Long id) {
        super("Resource not found ID: " + id);

    }
}
