package org.obeonetwork.database.m2doc.services;

import java.io.IOException;
import java.util.List;

import org.eclipse.acceleo.annotations.api.documentation.Documentation;
import org.eclipse.acceleo.annotations.api.documentation.Example;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.tools.api.actions.export.SizeTooLargeException;
import org.obeonetwork.dsl.database.Schema;
import org.obeonetwork.dsl.database.design.IDatabaseViewpointConstants;
import org.obeonetwork.m2doc.element.MImage;
import org.obeonetwork.m2doc.sirius.services.M2DocSiriusServices;

public class SchemaServices {

    // @formatter:off
    @Documentation(
            comment = "{m:schema.asSchemaImage()}",
            value = "Returns a collection of images representing the target Schema Schema Diagrams.",
            examples = {
                    @Example(
                            expression = "{m:schema.asSchemaImage()}", 
                            result = "A sequence of images.")
            }
        )
    // @formatter:on    
    public List<MImage> asSchemaImage(Schema schema) throws SizeTooLargeException, IOException {
        Session session = new EObjectQuery(schema).getSession();
        List<MImage> images = new M2DocSiriusServices(session, true).asImageByRepresentationDescriptionName(schema,
                IDatabaseViewpointConstants.SCHEMA_DIAGRAM_ID);

        return images;
    }

    // @formatter:off
    @Documentation(
            comment = "{m:schema.asSchemaImage(width)}",
            value = "Returns a collection of images representing the target Schema Schema Diagrams scaled to the given width keeping the initial image ratio.",
            examples = {
                    @Example(
                            expression = "{m:schema.asSchemaImage(400)}", 
                            result = "A sequence of images.")
            }
        )
    // @formatter:on    
    public List<MImage> asSchemaImage(Schema schema, int width) throws SizeTooLargeException, IOException {
        Session session = new EObjectQuery(schema).getSession();
        List<MImage> images = new M2DocSiriusServices(session, true).asImageByRepresentationDescriptionName(schema,
                IDatabaseViewpointConstants.SCHEMA_DIAGRAM_ID);
        images.forEach(i -> i.conserveRatio());
        images.forEach(i -> i.setWidth(width));

        return images;
    }

    // @formatter:off
    @Documentation(
            comment = "{m:schema.asSchemaImage(width, height)}",
            value = "Returns a collection of images representing the target Schema Schema Diagrams scaled to the given width and heigth.",
            examples = {
                    @Example(
                            expression = "{m:schema.asSchemaImage(400, 300)}", 
                            result = "A sequence of images.")
            }
        )
    // @formatter:on    
    public List<MImage> asSchemaImage(Schema schema, int width, int height) throws SizeTooLargeException, IOException {
        Session session = new EObjectQuery(schema).getSession();
        List<MImage> images = new M2DocSiriusServices(session, true).asImageByRepresentationDescriptionName(schema,
                IDatabaseViewpointConstants.SCHEMA_DIAGRAM_ID);
        images.forEach(i -> i.setHeight(height));
        images.forEach(i -> i.setWidth(width));

        return images;
    }

    // @formatter:off
    @Documentation(
            comment = "{m:schema.asSchemaPartialViewImage()}",
            value = "Returns a collection of images representing the target Schema Schema Partial View Diagrams.",
            examples = {
                    @Example(
                            expression = "{m:schema.asSchemaPartialViewImage()}", 
                            result = "A sequence of images.")
            }
        )
    // @formatter:on    
    public List<MImage> asSchemaPartialViewImage(Schema schema) throws SizeTooLargeException, IOException {
        Session session = new EObjectQuery(schema).getSession();
        List<MImage> images = new M2DocSiriusServices(session, true).asImageByRepresentationDescriptionName(schema,
                IDatabaseViewpointConstants.SCHEMA_PARTIAL_VIEW_DIAGRAM_ID);

        return images;
    }

    // @formatter:off
    @Documentation(
            comment = "{m:schema.asSchemaPartialViewImage(width)}",
            value = "Returns a collection of images representing the target Schema Schema Partial View Diagrams scaled to the given width keeping the initial image ratio.",
            examples = {
                    @Example(
                            expression = "{m:schema.asSchemaPartialViewImage(400)}", 
                            result = "A sequence of images.")
            }
        )
    // @formatter:on    
    public List<MImage> asSchemaPartialViewImage(Schema schema, int width) throws SizeTooLargeException, IOException {
        Session session = new EObjectQuery(schema).getSession();
        List<MImage> images = new M2DocSiriusServices(session, true).asImageByRepresentationDescriptionName(schema,
                IDatabaseViewpointConstants.SCHEMA_PARTIAL_VIEW_DIAGRAM_ID);
        images.forEach(i -> i.conserveRatio());
        images.forEach(i -> i.setWidth(width));

        return images;
    }

    // @formatter:off
    @Documentation(
            comment = "{m:schema.asSchemaPartialViewImage(width, height)}",
            value = "Returns a collection of images representing the target Schema Schema Partial View Diagrams scaled to the given width and heigth.",
            examples = {
                    @Example(
                            expression = "{m:schema.asSchemaPartialViewImage(400, 300)}", 
                            result = "A sequence of images.")
            }
        )
    // @formatter:on    
    public List<MImage> asSchemaPartialViewImage(Schema schema, int width, int height)
            throws SizeTooLargeException, IOException {
        Session session = new EObjectQuery(schema).getSession();
        List<MImage> images = new M2DocSiriusServices(session, true).asImageByRepresentationDescriptionName(schema,
                IDatabaseViewpointConstants.SCHEMA_PARTIAL_VIEW_DIAGRAM_ID);
        images.forEach(i -> i.setHeight(height));
        images.forEach(i -> i.setWidth(width));

        return images;
    }

}
