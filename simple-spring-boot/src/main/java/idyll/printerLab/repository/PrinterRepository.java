package idyll.printerLab.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import idyll.printerLab.entity.Printer;

public interface PrinterRepository extends JpaRepository<Printer, Long> {
}