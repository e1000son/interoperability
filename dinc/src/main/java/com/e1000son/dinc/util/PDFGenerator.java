package com.e1000son.dinc.util;

import com.e1000son.dinc.integration.dto.BirthCertificate;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Component
public class PDFGenerator {

    public void generatePDF(BirthCertificate birthCertificate, String filePath){
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));

            document.open();
            document.add(new PdfPTable(generateTable(birthCertificate)));
            document.close();

        } catch (DocumentException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private PdfPTable generateTable(BirthCertificate birthCertificate){
        PdfPTable table = new PdfPTable(2);

        PdfPCell cell;
        cell = new PdfPCell(new Phrase("Bilhete de Identidade"));
        cell.setColspan(2);
        table.addCell(cell);

        //Criando uma linha em branco
        cell = new PdfPCell(new Phrase(" "));
        cell.setColspan(2);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Detalhes do indivíduo"));
        cell.setColspan(2);
        table.addCell(cell);

        table.addCell("Nome");
        table.addCell(birthCertificate.getCitizen().getFirstName());

        table.addCell("Apelido");
        table.addCell(birthCertificate.getCitizen().getLastName());

        table.addCell("Nome do Pai");
        table.addCell(birthCertificate.getCitizen().getFathersName());

        table.addCell("Nome da Mãe");
        table.addCell(birthCertificate.getCitizen().getMothersName());


        cell = new PdfPCell(new Phrase("Detalhes da Conservatória"));
        cell.setColspan(2);
        table.addCell(cell);

        table.addCell("Designação");
        table.addCell(birthCertificate.getConservatoryOfRegistration());

        table.addCell("Endereço");
        table.addCell(birthCertificate.getAddress());

        table.addCell("Averbamento");
        table.addCell(birthCertificate.getEndorsment());

        table.addCell("Validade");
        table.addCell(birthCertificate.getRegisteredDate().toString());

        return table;
    }

}
