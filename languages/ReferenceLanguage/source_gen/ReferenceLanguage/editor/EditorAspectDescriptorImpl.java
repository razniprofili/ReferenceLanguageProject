package ReferenceLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Article_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Author_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Book_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new Booklet_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Conference_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new InBook_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new InProceedings_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new Incollection_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new Libraries_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new Manual_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new MasterThesis_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new Misc_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new PhdThesis_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new Proceedings_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd1eab40L), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef2267aL), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbeaL), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbffL), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc2eL), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc62L), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef22695L), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1e3ba47b555e32e8L), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef226c3L), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dc25L), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dc3cL), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fca5L), MetaIdFactory.conceptId(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef226d4L)).seal();
}
