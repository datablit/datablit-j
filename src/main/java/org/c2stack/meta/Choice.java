package org.c2stack.meta;

/**
 *
 */
public class Choice extends CollectionBase implements Describable {
    public Choice(String ident) {
        super(ident);
    }

    public ChoiceCase getCase(String caseIdent) {
        return (ChoiceCase) MetaUtil.findByIdent(this, caseIdent);
    }
}
