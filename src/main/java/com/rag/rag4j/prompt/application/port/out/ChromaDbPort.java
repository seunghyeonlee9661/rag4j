package com.rag.rag4j.prompt.application.port.out;

import com.rag.rag4j.common.documents.port.PersistenceOutputPort;

@PersistenceOutputPort
public interface ChromaDbPort {
    public String getSimilarChunks(String inputText,String keyWord);
}
