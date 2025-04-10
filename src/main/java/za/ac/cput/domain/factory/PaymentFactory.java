package za.ac.cput.domain.factory;

import za.ac.cput.domain.entities.Payment;
import za.ac.cput.domain.util.Helper;
import java.time.LocalDate;

public class PaymentFactory {

    public static Payment createPayment(String paymentID, double amount, boolean status, String paymentDate, String studentId) {
        // Validate paymentID (must be 'PAY' followed by 6 digits)
        if (!Helper.isValidPaymentId(paymentID)) {
            System.out.println("❌ Invalid payment ID. Could not create payment.");
            return null;
        }

        // Validate required fields
        if (amount <= 0 || Helper.isNullOrEmpty(paymentDate) || Helper.isNullOrEmpty(studentId)) {
            System.out.println("⚠️ Warning: Some required fields are empty or invalid.");
            return null;
        }

        // Convert paymentDate to LocalDate
        LocalDate date = Helper.parseDate(paymentDate);
        if (date == null) {
            System.out.println("❌ Invalid payment date format.");
            return null;
        }

        return new Payment.Builder()
                .paymentID(paymentID)
                .amount(amount) // Amount is already a double
                .status(status) // True if paid, false if not paid
                .paymentDate(date)
                .studentId(studentId)
                .build();
    }
}
