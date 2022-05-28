package document.dao;

import database.hibernate.HibernateManager;
import document.entity.Document;
import org.hibernate.query.Query;

import java.util.List;

public class DocumentDao {
    private static final DocumentDao instance;

    static {
        instance = new DocumentDao();
    }

    public static DocumentDao getInstance() {
        return instance;
    }

    public List<Document> getDocumentsWithNumPart(Long numPart) {
        var session = HibernateManager.getInstance().openNewSession();

        Query<Document> query = session.createQuery(
                "from Document doc where (cast(doc.docNumber as string) like :numPart and doc.isActive = true)",
                Document.class
        ).setParameter("numPart", '%' + String.valueOf(numPart) + '%');

        var result = query.list();
        session.close();
        return result;
    }
}
