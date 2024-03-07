package idyll.printerLab;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import idyll.printerLab.entity.Printer;
import idyll.printerLab.repository.PrinterRepository;

@SpringBootApplication(scanBasePackages = "idyll.printerLab")
@EnableJpaRepositories(basePackages = "idyll.printerLab.repository")
public class SimpleSpringBootApplication implements CommandLineRunner {

    private final PrinterRepository printerRepository;

    public SimpleSpringBootApplication(PrinterRepository printerRepository) {
        this.printerRepository = printerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Printer printer = new Printer();
        printer.setBrand("HP");
        printer.setModel("LaserJet Pro");
        printer.setPagePerMinute(30);
        printer.setColorPrinter(false);

        printerRepository.save(printer);
    }
}