package ReferenceLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class PhdThesis_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("[");
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.serNumber$3owZ) + "] ");
    tgs.appendNode(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.author$aDk$));
    tgs.append(". ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.title$aE1B));
    tgs.append(". ");
    tgs.append("PhD thesis, ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.school$aEIE));
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.address$aKP4) != null) {
      tgs.append(", ");
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.address$aKP4));
    }
    if (SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.month$aTwD) != null) {
      tgs.append(", ");
      tgs.append(SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.month$aTwD) + " ");
      tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.year$aMub) + ".");
    } else {
      tgs.append(", ");
      tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.year$aMub) + ".");
    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty serNumber$3owZ = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1e3ba47b555fd52cL, 0x1159e6fb6e9e4ecbL, "serNumber");
    /*package*/ static final SProperty title$aE1B = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fca5L, 0x1a03dc0acd30fca9L, "title");
    /*package*/ static final SProperty school$aEIE = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fca5L, 0x1a03dc0acd30fcacL, "school");
    /*package*/ static final SProperty address$aKP4 = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fca5L, 0x1a03dc0acd30fcb1L, "address");
    /*package*/ static final SProperty month$aTwD = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fca5L, 0x1a03dc0acd30fcc1L, "month");
    /*package*/ static final SProperty year$aMub = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fca5L, 0x1a03dc0acd30fcb8L, "year");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink author$aDk$ = MetaAdapterFactory.getContainmentLink(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fca5L, 0x1a03dc0acd30fca6L, "author");
  }
}
