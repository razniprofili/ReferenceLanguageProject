package ReferenceLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class Booklet_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("[");
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.serNumber$sPCH) + "] ");
    {
      Iterable<SNode> collection = SLinkOperations.getChildren(ctx.getPrimaryInput(), LINKS.authors$lfSN);
      final SNode lastItem = Sequence.fromIterable(collection).last();
      for (SNode item : collection) {
        tgs.appendNode(item);
        if (item != lastItem) {
          tgs.append(", ");
        }
      }
    }
    tgs.append(". ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.title$lgmP));
    tgs.append(". ");
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.howpublished$lgOR) != null) {
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.howpublished$lgOR));
    }
    if (SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.month$lmtf) != null) {
      tgs.append(", ");
      tgs.append(SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.month$lmtf) + " ");
    }
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.year$lnpj) + ".");
  }

  private static final class PROPS {
    /*package*/ static final SProperty serNumber$sPCH = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbeaL, 0x153d8b3481f25cddL, "serNumber");
    /*package*/ static final SProperty title$lgmP = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbeaL, 0x1da23d5c1241dbf1L, "title");
    /*package*/ static final SProperty howpublished$lgOR = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbeaL, 0x1da23d5c1241dbf3L, "howpublished");
    /*package*/ static final SProperty month$lmtf = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbeaL, 0x1da23d5c1241dbf6L, "month");
    /*package*/ static final SProperty year$lnpj = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbeaL, 0x1da23d5c1241dbfaL, "year");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink authors$lfSN = MetaAdapterFactory.getContainmentLink(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbeaL, 0x1da23d5c1241dbefL, "authors");
  }
}