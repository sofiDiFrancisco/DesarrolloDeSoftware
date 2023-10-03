package com.utn.apiRest.config;

import org.hibernate.envers.RevisionListener;
import com.utn.apiRest.entidades.audit.Revision;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision (Object revisionEntity){
        final Revision revison = (Revision) revisionEntity;
    }
}
