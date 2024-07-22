package com.projeto.curso.Service;

import com.projeto.curso.dao.DepartamentoDao;
import com.projeto.curso.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DepartamentoServiceImpl implements DepartamentoService{

    @Autowired
    private DepartamentoDao departamentoDao;
    @Override
    @Transactional(readOnly = false)
    public void salvar(Departamento departamento) {
        departamentoDao.save(departamento);
    }

    @Override
    @Transactional(readOnly = false)
    public void editar(Departamento departamento) {
        departamentoDao.update(departamento);
    }

    @Override
    @Transactional(readOnly = false)
    public void excluir(long id) {
        departamentoDao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Departamento buscarPorId(Long id) {
        return departamentoDao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Departamento> buscarTodos() {
        return departamentoDao.findAll();
    }
}
